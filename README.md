Spring ApplicationContext容器开始初始化

ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

BeanFactoryPostProcessor -> postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);

BeanNameAware -> setBeanName(String xxx);

BeanFactoryAware -> setBeanFactory(BeanFactory beanFactory);

BeanPostProcessor -> postProcessBeforeInitialization(Object bean, String beanName); 

InitializingBean -> afterPropertiesSet();

BeanPostProcessor -> postProcessAfterInitialization(Object bean, String beanName);

Spring ApplicationContext容器初始化完成

Xxx xxx = applicationContext.getBean(Xxx.class);