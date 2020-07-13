package phb2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phb2.entity.DataMhs;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}
