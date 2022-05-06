package com.liveasytransport.transportdetails.services;

import java.util.List;

import com.liveasytransport.transportdetails.entities.Load;

public interface LoadService {

	public List<Load> getLoads();

	public Load getLoad(long loadId);

	public Load addLoad(Load load);

	public Load updateLoad(Load load);

	public void deleteLoad(long parseLong);

}
