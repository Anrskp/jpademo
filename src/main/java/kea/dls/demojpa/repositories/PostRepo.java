package kea.dls.demojpa.repositories;

import kea.dls.demojpa.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

}
