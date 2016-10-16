package de.tom.endres.se.home;

import de.tom.endres.se.home.domain.Outbox;
import de.tom.endres.se.home.repository.OutboxRepository;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WerkstattApplication {

	private static final Logger log = LoggerFactory.getLogger(WerkstattApplication.class);

	@Value("${weather.apikey}")
	String apikey;

	@Autowired
	OutboxRepository outboxRepository;

	public static void main(String[] args) {
		SpringApplication.run(WerkstattApplication.class, args);
	}

	@Bean
	public CommandLineRunner doSomething() {
		return (args) -> {
			// declaring object of "OpenWeatherMap" class
			OpenWeatherMap owm = new OpenWeatherMap(OpenWeatherMap.Units.METRIC, OpenWeatherMap.Language.GERMAN,apikey);

			// getting current weather data for the "London" city
			CurrentWeather cwd = owm.currentWeatherByCityName("Melchow");
			// checking data retrieval was successful or not
			if (cwd.isValid()) {

				// checking if city name is available
				if (cwd.hasCityName()) {
					//printing city name from the retrieved data
					log.info("City: " + cwd.getCityName());
				}

				// checking if max. temp. and min. temp. is available
				if (cwd.getMainInstance().hasMaxTemperature() && cwd.getMainInstance().hasMinTemperature()) {
					// printing the max./min. temperature
					log.info("Temperature: " + cwd.getMainInstance().getMaxTemperature()
							+ "/" + cwd.getMainInstance().getMinTemperature() + "\'C");
				}

				DailyForecast dfc = owm.dailyForecastByCityName("Melchow", (byte) 1);
				// checking for rain
				if (dfc.getForecastInstance(0).hasRain()) {
					// printing the max./min. temperature
					log.info("Rain: " + dfc.getForecastInstance(0).getRain());
				}
			}

			Outbox outbox = new Outbox();
			outbox.setDestinationNumber("+491739939271");
			outbox.setTextDecoded("test4");
			outboxRepository.saveAndFlush(outbox);
			log.info("done");
		};
	}
}
