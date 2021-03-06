package me.kadarh.mecaworks.service;

import me.kadarh.mecaworks.domain.others.Chantier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChantierService {

	Chantier add(Chantier chantier);

	Chantier update(Chantier chantier);

	Page<Chantier> chantierList(Pageable pageable, String search);

    Chantier get(Long id);

	void delete(Long id);

    List<Chantier> getList();
}
