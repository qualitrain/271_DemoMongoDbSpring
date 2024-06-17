package mx.com.qtx.demoMongo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import mx.com.qtx.demoMongo.entidades.Articulo;

@Repository
public class GestorPersistenciaVtasMongoTemplate {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public GestorPersistenciaVtasMongoTemplate() {
		super();
	}

	public List<Articulo>leerArticulos(){
		
		List<Articulo> articulos = this.mongoTemplate.findAll(Articulo.class);
		return articulos;
	}
}
