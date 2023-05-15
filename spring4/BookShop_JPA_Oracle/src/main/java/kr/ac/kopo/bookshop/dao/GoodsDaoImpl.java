package kr.ac.kopo.bookshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import kr.ac.kopo.bookshop.model.Goods;
import kr.ac.kopo.bookshop.pager.Pager;

@Repository
public class GoodsDaoImpl implements GoodsDao {

	@PersistenceContext
	private EntityManager em;

	
	@Override
	public int total(Pager pager) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT COUNT(*) FROM Goods", Long.class).getSingleResult().intValue();//Goods클래스명으로 넣어야됨
	}

	@Override
	public List<Goods> list(Pager pager) {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Goods g ORDER BY g.goodsId",Goods.class )
				.setFirstResult(pager.getOffset())
				.setMaxResults(pager.getPerPage())
				.getResultList();
	}

	@Transactional
	@Override
	public void add(Goods item) {
		// TODO Auto-generated method stub
		em.persist(item);
	}


	@Override
	public Goods item(int goodsId) {
		// TODO Auto-generated method stub
		return em.find(Goods.class, goodsId);
	}

	@Transactional
	@Override
	public void update(Goods item) {
		// TODO Auto-generated method stub
		em.merge(item);
	}

	@Transactional
	@Override
	public void delete(int goodsId) {
		// TODO Auto-generated method stub
		Goods item = em.find(Goods.class, goodsId);
		em.remove(item);
		
	}

	@Override
	public void delete(Goods item) {
		// TODO Auto-generated method stub
		em.remove(item);
	}

	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Goods g ORDER BY g.goodsId ", Goods.class).getResultList();
	}

}
