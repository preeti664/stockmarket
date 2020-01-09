package com.database.springbootdb.batch;
import com.database.springbootdb.repository.DataRepos;
import com.database.springbootdb.model.Data;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
	public class DBwriter implements ItemWriter<Data> {

	    @Autowired
	    private DataRepos DataRepos;

	    @Override
	    public void write(List<? extends Data> data) throws Exception {

	        System.out.println("Data Saved for Users: " + data);
	        //DataRepos.save(data);
	    }

}
