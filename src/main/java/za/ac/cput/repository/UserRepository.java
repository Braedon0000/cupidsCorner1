package za.ac.cput.repo;
//UserRepository.java
//UserProfile Repo class
//Author:Braedon Sidney Mullins(222821825)
//Date:27 March 2024

import za.ac.cput.domain.UserProfile;

import java.util.List;

public interface UserRepository extends IRepository<UserProfile,String>{

    List<UserProfile> getall();
}
