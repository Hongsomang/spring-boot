package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.ac.kopo.bookshop.dao.GoodsDao;
import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.model.Goods;
import kr.ac.kopo.bookshop.pager.Pager;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsDao dao;
	
	@Override
	public List<Goods> list(Pager pager) {
		// TODO Auto-generated method stub
		int total=dao.total(pager);
		pager.setTotal(total);
		return dao.list(pager);
	}

	@Override
	@Transactional
	public void add(Goods item) {
		// TODO Auto-generated method stub
		dao.add(item);
	}

	@Override
	@Transactional
	public Goods item(int goodsId) {
		// TODO Auto-generated method stub
		return dao.item(goodsId);
	}
	
	
	@Override
	@Transactional
	public void update(Goods item) {
		// TODO Auto-generated method stub
		dao.update(item);
	}

	@Override
	@Transactional
	public void delete(int goodsId) {
		// TODO Auto-generated method stub
		dao.delete(goodsId);
	}

	@Override
	@Transactional
	public void dummy() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			Goods item=new Goods();
			
			item.setName("상품"+i);
			item.setVendor("제조사"+i);
			item.setPrice(i*1000);
			dao.add(item);
		}
	}

	@Override
	@Transactional
	public void init() {
		// TODO Auto-generated method stub

		List<Goods> list =dao.findAll();
		for(Goods item :list) {
			dao.delete(item);
		}
	}

}
