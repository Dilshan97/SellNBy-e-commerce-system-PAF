/*Author Nuwan Chamikara*/

package com.elitlabs.ecommerce.repositories;

        import com.elitlabs.ecommerce.models.UserDTO;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

}
