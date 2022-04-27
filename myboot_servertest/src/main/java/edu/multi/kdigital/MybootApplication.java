package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import other.OtherController;
import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

//클래스 부트 프로젝트 시작 파일
// 1>자동 tomcat 서버 내장 시작
// 2> @ annotation 스캔
// 실행 - run as - spring boot app(java application 선택 실행x)

@SpringBootApplication
//@ComponentScan(basePackageClasses = HelloController.class)
@ComponentScan
@ComponentScan(basePackageClasses = OtherController.class)
@ComponentScan(basePackageClasses = UploadController.class)
//@ComponentScan(basePackages = {"upload"})
@ComponentScan(basePackageClasses = ProductController.class)
@MapperScan(basePackageClasses = ProductDAO.class)
//@ComponentScan(basePackages = {"product"})
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@MapperScan(basePackageClasses = MemberDAO.class)
public class MybootApplication {

	public static void main(String[] args) {
		System.out.println("===스프링부트실행시작===");
		SpringApplication.run(MybootApplication.class, args);
		System.out.println("===스프링부트실행중===");
	}

}
