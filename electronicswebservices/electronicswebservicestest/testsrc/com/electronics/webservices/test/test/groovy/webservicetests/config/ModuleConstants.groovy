/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.electronics.webservices.test.test.groovy.webservicetests.config

public class ModuleConstants {

	//this is suffix of extension name, it is also added to new name
	public static final String TEST_EXTENSION_SUFFIX = 'test';

	//original name of the web services module, it is not touched by modulegen because we are in electronicswebservicestest
	public static final String ORIGINAL_MODULE_NAME = 'ycommercewebservices';
	public static final String ORIGINAL_WEB_EXTENSION_NAME = ORIGINAL_MODULE_NAME;
	public static final String ORIGINAL_TEST_EXTENSION_NAME = ORIGINAL_MODULE_NAME + TEST_EXTENSION_SUFFIX;

	//name of the current extension, it is changed after calling modulegen
	public static final String CURRENT_TEST_EXTENSION_NAME = 'electronicswebservicestest';

	//from this 'equation' we obtain new module name
	public static final String CURRENT_MODULE_NAME = CURRENT_TEST_EXTENSION_NAME.minus(TEST_EXTENSION_SUFFIX);
}
