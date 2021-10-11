package com.example.demo;
import com.slytherin.phase2.model.*;
import com.slytherin.phase2.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileRepo userRepo;
	
	// Get All Profile
    @GetMapping("/Profile")
    public List<UserProfile> getAllUserProfile() {
        return userRepo.findAll();
    }
 // Create a new user
   @PostMapping("/Profile")
  public UserProfile createprofile(@Validated @RequestBody UserProfile profile) {    
	   return userRepo.save(profile);
   }
 // Get a Single User
//   @GetMapping("/profile/{cust_id}")
//   public UserProfile getProfileeById(@PathVariable(value = "cust_id") Long custId) throws UserProfileNotFoundException {
//       return userRepo.findById(custId)
//                .orElseThrow(() -> new BookNotFoundException(custId));
//   }
//
//// Update a Note
//    @PutMapping("/profile/{cust_id}")
//    public UserProfile updateProfile(@PathVariable(value = "cust_id") Long custId,
//                           @Validated @RequestBody UserProfile profileDetails) throws BookNotFoundException {
//
//UserProfile profile= userRepo.findById(custId)
//                .orElseThrow(() -> new BookNotFoundException(custId));
//
//profile.setFirst_name(profileDetails.getFirst_name());
//        profile.setLast_name(profileDetails.getLast_name());
//        profile.setEmail(profileDetails.getEmail());
//
//UserProfile updatedprofile = userRepo.save(profile);
//
//return updatedprofile;
//    }
//
//// Delete a Note
//    @DeleteMapping("/profile/{cust_id}")
//    public ResponseEntity<?> deleteprofile(@PathVariable(value = "cust_id") Long custId) throws BookNotFoundException {
//       UserProfile profile = userRepo.findById(custId)
//                .orElseThrow(() -> new BookNotFoundException(bookId));
//
//UserProfile.delete(profile);
//
//return ResponseEntity.ok().build();
//    }
//}
}
