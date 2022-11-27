package micv.app;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
import org.hildan.fxgson.FxGson;
 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
 
import micv.json.LocalDateAdapter;
import micv.model.CV;
import micv.model.Nacionalidad;
import micv.model.Personal;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
public class Main {
 
	private static Gson gson = FxGson.fullBuilder()
			.setPrettyPrinting()
			.registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
			.create();
 
	public static void main(String[] args) throws IOException, URISyntaxException {
 
//		saveCV();
//		loadCV();
 
//		App.main(args);
 
 
//		URI uri = Main.class.getResource("/csv/nacionalidades.csv").toURI();
//		
//		List<String> lines = Files.readAllLines(Paths.get(uri), StandardCharsets.UTF_8);
//		
//		lines
//			.stream()
//			.map(x -> 6)
//			.forEach(n -> System.out.println(n));
 
 
		List<Integer> numeros = Arrays.asList(6, 8, 34, 25, 32);
		List<Integer> cuadradosMayores1000 = numeros
				.stream()
				.filter(n -> (n * n) >= 1000)
				.collect(Collectors.toList());
 
		System.out.println(cuadradosMayores1000);
 
//		System.out.println(nacionalidades);
 
	}
 
	private static void loadCV() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
 
		File cvFile = new File("cv.json"); 
 
		CV cv = gson.fromJson(new FileReader(cvFile), CV.class);
 
		System.out.println(cv.getPersonal().getNombre() + " " + cv.getPersonal().getApellidos());
 
	}
 
	private static void saveCV() throws IOException {
		Personal personal = new Personal();
		personal.setIdentificacion("12345678Z");
		personal.setNombre("Chuck");
		personal.setApellidos("Norris");
		personal.getNacionalidades().add(new Nacionalidad("Española"));
		personal.getNacionalidades().add(new Nacionalidad("Americana"));
		personal.setPais("Estados Unidos");
		personal.setFechaNacimiento(LocalDate.of(1954, 11, 25));
 
		CV cv = new CV();
		cv.setPersonal(personal);
 
		String json = gson.toJson(cv, CV.class);
 
		File cvFile = new File("cv.json"); 
 
		Files.writeString(cvFile.toPath(), json, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
	}
 
}