/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.electronics.webservices.test.test.groovy.webservicetests.docu;

/**
 * Save responses from web services to dir "{@link SaveWSOutputStrategy#WS_OUTPUT_DIR}+/by resources/",
 * responses for the same request in the same file
 */
public class SaveByResourcesWSOutputStrategy implements SaveWSOutputStrategy {

	private File dir = null
	private String ln = null

	public SaveByResourcesWSOutputStrategy() {
		ln = System.getProperty('line.separator');
		dir = new File(WS_OUTPUT_DIR + "/by resources/")
		if (!dir.exists()) {
			boolean create = dir.mkdirs();
		}
	}

	@Override
	public void saveFailedTest(final SummaryOfRunningTest summary, Throwable t) {
		// do nothing
	}

	@Override
	public void saveSucceededTest(final SummaryOfRunningTest summary) {

		for (WSRequestSummary temp : summary.requests) {
			String fileName = temp.httpMethod + "_" + temp.resource + "_" + temp.accept + ".txt";
			fileName = fileName.replace('\\', '#').replace('/', '#').replace(':', '#').replace('?', '#').replace('"', '#').replace('<', '#').replace('>', '#').replace('|', '#')

			File f = new File(dir, fileName);
			if (!f.exists()) {
				f.createNewFile();
			}

			temp.with {
				f << "RESOURCE: " << resource << ln;
				f << "HTTP METHOD: " << httpMethod << ln;
				f << "ACCEPT: " << accept << ln;
				f << "RESPONSE: " << ln << response << ln;
				f << "*".multiply(80) << ln;
			}
		}
	}
}
