package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.luv2code.Service.DetailsFetcher;

@SpringBootApplication
public class PrecedenceInYamlAndPropertiesFile {

	public static void main(String[] args) {
		System.out.println("InjectingCollectionsAndHasAproperties.main(1)");
		ApplicationContext context = SpringApplication.run(PrecedenceInYamlAndPropertiesFile.class, args);
		System.out.println("InjectingCollectionsAndHasAproperties.main(2)");
		DetailsFetcher detailsFetcher = context.getBean(DetailsFetcher.class);
		System.out.println("InjectingCollectionsAndHasAproperties.main(3)");
		detailsFetcher.fetchAndShowDetails();
		System.out.println("InjectingCollectionsAndHasAproperties.main(4)");
	}

}
