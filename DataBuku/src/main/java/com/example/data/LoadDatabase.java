package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(9786025132414L, "Internet Sehat Pedoman Berinternet Sehat, Aman, Nyaman dan Bertanggung jawab","Education",
                    "ICT Watch - Indonesia", "2017", 250000L )));
            log.info("Preloading" + repository.save(new Data(9786025132407L, "Kebijakan Cybersecurity dalam Perspektif Multistakeholder", "Education",
                    "ICT Watch - Indonesia", "2018", 200000L )));
            log.info("Preloading" + repository.save(new Data(60156952L, "Eksploitasi Seksual Pada Anak Online, Sebuah Pemahaman Bersama", "Education",
                    "ECPAT", "2017", 150000L )));
            log.info("Preloading" + repository.save(new Data(9786027396326L, "Kajian Dampak Media Sosial bagi Anak dan Remaja", "Education",
                    "Puskakom UI", "2017", 100000L )));
        };
    }
}
