package com.example.demo;

import com.example.demo.ws.GlAccountServiceImpl;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.ws.Endpoint;

/**
 *
 */
@ApplicationPath("/data")
public class DemoRestApplication extends Application {
}
