/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.electronics.webservices.test.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.electronics.webservices.test.constants.YcommercewebservicestestConstants;

import org.apache.log4j.Logger;


public class YcommercewebservicestestManager extends GeneratedYcommercewebservicestestManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(YcommercewebservicestestManager.class.getName());

	public static final YcommercewebservicestestManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (YcommercewebservicestestManager) em.getExtension(YcommercewebservicestestConstants.EXTENSIONNAME);
	}

}
