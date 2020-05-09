/**
 * Copyright (c) 2011-2016, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.easy.ccl.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.*;

public class MysqlGenerator {


    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        // 自定义需要填充的字段

        // tableFillList.add( new TableFill( "ASDD_SS", FieldIgnore.INSERT_UPDATE ) );
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                getGlobalConfig()
        ).setDataSource(
                getDataSourceConfig()
        ).setStrategy(
                getStrategyConfig()
        ).setPackageInfo(
                getPackageConfig()
        ).
//                setCfg(
//                        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
//                        getInjectionConfig()
//                ).
        setTemplate(
        getTemplateConfig()
);

        // 执行生成
        mpg.execute();
    }

    private static GlobalConfig getGlobalConfig() {
        return new GlobalConfig()
                //输出目录
                .setOutputDir("/Users/jeff/Desktop")
                // 是否覆盖文件
                .setFileOverride(true)
                // 开启 activeRecord 模式
                .setActiveRecord(true)
                // XML 二级缓存
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList
                .setBaseColumnList(true)
                .setAuthor("jeff")
                // 自定义文件命名，注意 %s 会自动填充表实体属性！
                // .setMapperName("%sDao")
                // .setXmlName("%sDao")
                .setServiceName("I%sManageService")
                .setServiceImplName("%sServiceImpl");
    }

    private static DataSourceConfig getDataSourceConfig() {
        return new DataSourceConfig()
                // 数据库类型
                .setDbType(DbType.MYSQL)
                .setTypeConvert(new MySqlTypeConvert())
                .setDriverName("com.mysql.jdbc.Driver")
                .setUsername("root")
                .setPassword("chop!@#123")
                .setUrl("jdbc:mysql://172.16.6.19:3306/bus_ticket_system?characterEncoding=utf8");

    }

    private static StrategyConfig getStrategyConfig() {
        List<TableFill> tableFillList = new ArrayList<>();
        return new StrategyConfig()
                // 全局大写命名
                // .setCapitalMode(true)
                //全局下划线命名
                // .setDbColumnUnderline(true)
                // 此处可以修改为您的表前缀
                .setTablePrefix("ticket")
                // 表名生成策略
                .setNaming(NamingStrategy.underline_to_camel)
                // .setExclude(new String[]{"test"}) // 排除生成的表
                // 自定义实体父类
                // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                // 自定义实体，公共字段
                // .setSuperEntityColumns( new String[]{ "test_id" } )
                .setTableFillList(tableFillList)
                // 自定义 mapper 父类
                // .setSuperMapperClass("com.baomidou.demo.TestMapper")
                // 自定义 service 父类
                // .setSuperServiceClass("com.baomidou.demo.TestService")
                // 自定义 service 实现类父类
                // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                // 自定义 controller 父类
                // .setSuperControllerClass("com.baomidou.demo.TestController")
                // 【实体】是否生成字段常量（默认 false）
                // public static final String ID = "test_id";
                // .setEntityColumnConstant(true)
                // 【实体】是否为构建者模型（默认 false）
                // public User setName(String name) {this.name = name; return this;}
                // .setEntityBuilderModel(true)
                // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                .setEntityLombokModel(true)
                // Boolean类型字段是否移除is前缀处理
                .setEntityBooleanColumnRemoveIsPrefix(true)
                .setRestControllerStyle(true)
                .setControllerMappingHyphenStyle(true)
                //需要生成的表
                .setInclude(new String[]{"cardms_card"});
    }

    private static PackageConfig getPackageConfig() {
        return new PackageConfig()
                // .setModuleName( "test" )
                .setParent("cn.easysw.bts")
                .setService("service")
                .setServiceImpl("serviceImpl")
                .setEntity("entity");
    }

    private static InjectionConfig getInjectionConfig() {
        return new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc" , this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        }.setFileOutConfigList(Collections.singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
            // 自定义输出文件目录
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "/Users/jeff/Desktop/com/xml/" + tableInfo.getEntityName() + ".xml";
            }
        }));
    }

    private static TemplateConfig getTemplateConfig() {
        return new TemplateConfig()
                .setEntity("templates/mybatis/plus/entity.java.vm")
                // .setMapper("...");
                // .setXml("...")
                .setService("templates/mybatis/plus/service.java.vm")
                .setServiceImpl("templates/mybatis/plus/serviceImpl.java.vm");
    }

}
