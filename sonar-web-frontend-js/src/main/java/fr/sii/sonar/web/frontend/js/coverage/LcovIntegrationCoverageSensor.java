package fr.sii.sonar.web.frontend.js.coverage;

import fr.sii.sonar.coverage.lcov.factory.LcovProviderFactory;
import fr.sii.sonar.report.core.common.PluginDependencies;
import fr.sii.sonar.report.core.common.ReportSensor;
import fr.sii.sonar.report.core.coverage.domain.CoverageReport;
import fr.sii.sonar.report.core.coverage.factory.IntegrationCoverageSaverFactory;

/**
 * Sensor specific to JavaScript code coverage for integration tests that loads LCOV report
 * 
 * @author Aurélien Baudet
 *
 */
public class LcovIntegrationCoverageSensor extends ReportSensor<CoverageReport> {

	public LcovIntegrationCoverageSensor(LcovUnitCoverageConstants constants, PluginDependencies pluginDependencies) {
		super(constants, pluginDependencies, new LcovProviderFactory(), new IntegrationCoverageSaverFactory());
	}

}
