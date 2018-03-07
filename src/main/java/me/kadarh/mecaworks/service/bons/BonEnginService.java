package me.kadarh.mecaworks.service.bons;

import me.kadarh.mecaworks.domain.bons.BonEngin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface BonEnginService {

	BonEngin add(BonEngin bonEngin);

    List<BonEngin> bonList(Long idEngin, LocalDate date1, LocalDate date2);

	// todo : ordered by date (ila mal9itich kiddir liha andirha f Pageable, fait signe b chi todo f controller)
	Page<BonEngin> getPage(Pageable pageable, String search);

	void delete(Long id);

	boolean hasErrors(BonEngin bon);
}
