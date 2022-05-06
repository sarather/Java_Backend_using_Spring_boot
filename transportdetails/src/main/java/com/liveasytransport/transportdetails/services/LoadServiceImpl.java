package com.liveasytransport.transportdetails.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasytransport.transportdetails.dao.LoadDao;
import com.liveasytransport.transportdetails.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	@Autowired
	private LoadDao ld;
	
	//List<Load> list;
	public LoadServiceImpl() {
		//list = new ArrayList<>();
		//list.add(new Load("Delhi","Jaipur","Chemical","Canter",1,100,"Handle with Care",101,"06-05-2022"));
		//list.add(new Load("Bhopal","Indore","Books","Canter",2,250,"Handle with Care",102,"07-05-2022"));
	}
	
	//Display all data
	@Override
	public List<Load> getLoads() {
		// TODO Auto-generated method stub
		return ld.findAll();
	}
	
	//Get only one data
	@Override
	public Load getLoad(long loadId) {
		// TODO Auto-generated method stub
	//	Load l=null;
		//for(Load load:list) {
			//if(load.getShipperId()== loadId) {
				//l=load;
				//break;
			//}
		//}
		return ld.getById(loadId);
	}
	
	//add data
	@Override
	public Load addLoad(Load load) {
		// TODO Auto-generated method stub
	//	list.add(load);
		ld.save(load);
		System.out.println("loads details added successfully ");
		return load;
	}
	
	//update data
	@Override
	public Load updateLoad(Load load) {
		// TODO Auto-generated method stub
		//list.forEach(e -> {
			//if(e.getShipperId()==load.getShipperId()) {
				//e.setLoadingPoint(load.getLoadingPoint());
				//e.setUnloadingPoint(load.getUnloadingPoint());
				//e.setProductType(load.getProductType());
				//e.setTruckType(load.getTruckType());
				//e.setNoOfTrucks(load.getNoOfTrucks());
				//e.setWeight(load.getWeight());
				//.setOptional(load.getOptional());
//				e.setDate(load.getDate());
//			}
//		});
		ld.save(load);
		return load;
	}
	
	//delete data
	@Override
	public void deleteLoad(long parseLong) {
		// TODO Auto-generated method stub
	//	list=this.list.stream().filter(e->e.getShipperId()!=parseLong).collect(Collectors.toList());
		Load entity =ld.getById(parseLong);
		ld.delete(entity);
	}

}
