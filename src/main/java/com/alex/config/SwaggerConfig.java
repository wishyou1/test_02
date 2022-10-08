/**  
* 文件名：SwaggerConfig.java <br>
* 包名：com.unistec.framework.run <br>
* 版本信息：V1.0  <br>
* 日期：2019年5月1日  <br>
* Copyright 同方电子 Corporation 2019<br>
* 版权所有 北京紫光数智科技股份有限公司
*  
*/
package com.alex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 项目名称：unistec-framework<br>
 * 包名：com.unistec.framework.run <br>
 * 类名称：SwaggerConfig <br>
 * 类描述：简单描述该类的主要功能<br>
 ****************************************************** <br>
 * 主要方法：<br>
 * 描述各个方法用途 <br>
 * 描述各个方法用途 <br>
 ****************************************************** <br>
 * 作者：jake <br>
 * 创建日期：2019年5月1日 <br>
 * 公司：北京紫光数智科技股份有限公司<br>
 * 版本：V1.0<br>
 ******************************************************* <br>
 * 修改人：jake <br>
 * 修改时间：2019年5月1日 下午9:39:18 <br>
 * 修改原因： 描述修改原因和用途<br>
 * 
 */
@Configuration
@EnableOpenApi
public abstract class SwaggerConfig {
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).enable(true).select()
				// apis： 添加swagger接口提取范围
				.apis(RequestHandlerSelectors.basePackage("com.alex"))
				// .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("XX项目接口文档").description("XX项目描述")
				.contact(new Contact("作者", "作者URL", "作者Email")).version("1.0").build();
	}

}
