//package app.models;
//
//import javax.annotation.PreDestroy;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//import br.com.caelum.vraptor.ioc.Component;
//import br.com.caelum.vraptor.ioc.ComponentFactory;
//
//@Component
//public class FabricaDeEntityManager implements ComponentFactory<EntityManager> {
//	
//	private final EntityManager manager;
//	
//	public FabricaDeEntityManager(EntityManagerFactory factory) {
//		this.manager = factory.createEntityManager();
//	}
//	
//
//	@Override
//	public EntityManager getInstance() {
//		return this.manager;
//	}
//	
//	@PreDestroy
//	public void fechaManager(){
//		this.manager.close();
//	}
//
//}
