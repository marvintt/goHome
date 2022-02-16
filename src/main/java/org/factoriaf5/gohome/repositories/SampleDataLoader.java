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
    }

    @PostConstruct
    public void loadSampleData() {
        goHomeRepository.saveAll(List.of(

                new GoHome("Napoles", "http://2.bp.blogspot.com/-CPACB1sSmGs/Unvq3fKG4uI/AAAAAAAAHd8/iJoo2HB7dG4/s1600/fachada-de-casa-moderna-de-ladrillo-visto-de-2-pisos.jpg", "700", "670m2", "", "5"),
                new GoHome("Los Rosales", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fdecoraideas.com%2Fwp-content%2Fuploads%2F2019%2F08%2F05-2.jpg&f=1&nofb=1", "400", "500m2", "", "3"),
                new GoHome("Los Alpes", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.hmNI18nmTg65R0gTJ5fZsAHaGm%26pid%3DApi&f=1", "350", "300m2", "", "2"),
                new GoHome("Bella Vista", "https://images.homify.com/images/a_0,c_limit,f_auto,h_1024,q_auto,w_1024/v1479748324/p/photo/image/1709765/Casa_Villa_Lobos_2/fotos-de-casas-moderno-por-arquiteto-aquiles-nicolas-kilaris.jpg", "630", "520m2", "", "4"),
                new GoHome("Calera", "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.casapost.ro%2Fwp-content%2Fuploads%2F2017%2F08%2FCasa-doar-parter-cu-geamuri-mari-1024x768.jpg&f=1&nofb=1", "250", "280m2", "", "3"),
                new GoHome("Colina", "https://e00-expansion.uecdn.es/assets/multimedia/imagenes/2017/03/22/14902185122356.jpg", "450", "300m2", "", "4"),
                new GoHome("Peñaflor", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.XxNZZ8R89WWt-t7lEuB2FAHaE8%26pid%3DApi&f=1", "320", "600m2", "", "5"),
                new GoHome("Villarrapa", "https://www.miamiinmuebles.com/images/mls/A/10723310/1.jpg", "300", "350m2", "", "2"),
                new GoHome("Napoles", "http://2.bp.blogspot.com/-CPACB1sSmGs/Unvq3fKG4uI/AAAAAAAAHd8/iJoo2HB7dG4/s1600/fachada-de-casa-moderna-de-ladrillo-visto-de-2-pisos.jpg", "700", "670m2", "", "5")
        ));
    }
}


