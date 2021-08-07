/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.electronics.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.electronics.core.constants.ElectronicsCoreConstants;
import com.electronics.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ElectronicsCoreManager extends GeneratedElectronicsCoreManager
{
	public static final ElectronicsCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ElectronicsCoreManager) em.getExtension(ElectronicsCoreConstants.EXTENSIONNAME);
	}
}
