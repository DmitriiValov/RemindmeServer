package com.prolev.remindme.server.repository;

import com.prolev.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dmitryvalov on 26.07.17.
 */
public interface RemindRepository extends JpaRepository<Remind, Long>{

}
