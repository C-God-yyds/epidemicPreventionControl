package cn.easthome.skd.springbootskd01.repository;

import cn.easthome.skd.springbootskd01.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Integer> {
}
