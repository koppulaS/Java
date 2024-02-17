package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.ProductDao;
import com.Model.Product;



@Controller
public class MainController {

	@Autowired
	private ProductDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String get(ModelMap model) {
        return "index";
    }
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.GET)
    public String saveProduct(Product product) {
		dao.createProduct(product);
        return "saveMessage";
    }
	@RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
    public String updateProduct(Product product) {
		dao.updateProduct(product);
        return "updateMessage";
    }
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(Product product,BindingResult result) {
		int pid=product.getProductId();
		dao.deleteProduct(pid);
        return "deleteMessage";
    }
	
	@RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ModelAndView deleteProduct(Integer productId) {
		ModelAndView mv=new ModelAndView();
	Product product=dao.getByIdProduct(productId);
	System.out.println(product.getProductId() + product.getProductName());
	mv.setViewName("index");
	mv.addObject("getIdObj", product);
        return mv;
    }
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ModelAndView getAllProduct() {
		List<Product>product=dao.getProducts();	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("getAll");
		mv.addObject("product",product);
		mv.addObject(product);
        return mv;
    }
	public String home() {
		return"home";
	}
}
