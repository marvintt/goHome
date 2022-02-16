package org.factoriaf5.gohome.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {
    private GoHomeRepository goHomeRepository;

    @Autowired
    public SampleDataLoader(GoHomeRepository goHomeRepository) {
        this.goHomeRepository = goHomeRepository;

        @PostConstruct
        public void loadSampleData() {
            goHomeRepository.saveAll(List.of(
                    new GoHome("Napoles", "http://2.bp.blogspot.com/-CPACB1sSmGs/Unvq3fKG4uI/AAAAAAAAHd8/iJoo2HB7dG4/s1600/fachada-de-casa-moderna-de-ladrillo-visto-de-2-pisos.jpg", "700", "670m2", "", "5"),
                    new GoHome("Los Rosales", ""),
                    new Go("Object Design", "Rebecca Wirfs-Brock", "Software")
            ));
        }
    }
    }

