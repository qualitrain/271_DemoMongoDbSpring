package mx.com.qtx.demoMongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mx.com.qtx.demoMongo.entidades.Articulo;
import mx.com.qtx.demoMongo.persistencia.GestorPersistenciaVtasMongoTemplate;

@Component
public class EjecutorDemoMongo implements CommandLineRunner {
	
	@Autowired
	GestorPersistenciaVtasMongoTemplate gestorPersistencia;

	@Override
	public void run(String... args) throws Exception {
		List<Articulo> lstArticulos = gestorPersistencia.leerArticulos();
		System.out.println("Articulos:");
		lstArticulos.forEach(artI->System.out.println(artI));
	}

}
