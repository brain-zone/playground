package net.matrix.petclinic.services.jpa;

import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.repositories.VetRepository;
import net.matrix.petclinic.services.OwnerService;
import net.matrix.petclinic.services.VetService;

/**
 * A Jpa implementation of {@link OwnerService}.
 *
 * @author anand.hemadri
 *
 */
public class VetJpaService extends AbstractJpaService<Veterinarian, VetRepository> implements VetService {

	/**
	 * Constructs a new instance of {@link VetJpaService}.
	 *
	 * @param repository
	 */
	public VetJpaService(VetRepository repository) {
		super(repository);
	}

}
