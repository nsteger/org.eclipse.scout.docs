package org.eclipse.scout.widgets.client.ui.desktop.pages.bench;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.bench.layout.BenchColumnData;
import org.eclipse.scout.rt.client.ui.desktop.bench.layout.BenchLayoutData;
import org.eclipse.scout.rt.client.ui.desktop.bench.layout.FlexboxLayoutData;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.classid.ClassId;

@ClassId("29c3d138-cf65-4359-8a8b-0dda7cb48c37")
public class ConfigurableRowBenchLayoutNodePage extends AbstractBenchLayoutPageWithNodes {

  @Override
  protected String getConfiguredTitle() {
    return "Row Bench Layout";
  }

  @Override
  protected BenchLayoutData getConfiguredBenchLayoutData() {
    return new BenchLayoutData()
        .withCenter(
            new BenchColumnData()
                .withTop(new FlexboxLayoutData())
                .withCenter(new FlexboxLayoutData())
                .withBottom(new FlexboxLayoutData()));
  }

  @Override
  protected void execCreatePageForms(List<IForm> formList) {

    // top form
    TopForm top = new TopForm();
    top.start();
    formList.add(top);

    // center form
    CenterForm center = new CenterForm();
    center.start();
    formList.add(center);
    // south
    BottomForm bottom = new BottomForm();
    bottom.start();
    formList.add(bottom);

  }

  @ClassId("c0d9b110-01b0-4456-9dd0-2671253c0e90")
  private class TopForm extends AbstractConfigureBenchLayoutForm<FlexboxLayoutData> {
    @Override
    protected String getConfiguredDisplayViewId() {
      return VIEW_ID_N;
    }

    @Override
    protected FlexboxLayoutData getLayoutDataForUpdate() {
      return getDesktop().getBenchLayoutData().getCenter().getTop().copy();
    }

    @Override
    protected void storeLayoutData(FlexboxLayoutData layoutData) {
      BenchLayoutData benchLayoutData = getDesktop().getBenchLayoutData().copy();
      benchLayoutData.getCenter().withTop(layoutData);
      getDesktop().setBenchLayoutData(benchLayoutData);
    }

  }

  @ClassId("2f9a63ae-3c2c-4a12-b7fc-0114a834dbfd")
  private class CenterForm extends AbstractConfigureBenchLayoutForm<FlexboxLayoutData> {
    @Override
    protected String getConfiguredDisplayViewId() {
      return VIEW_ID_CENTER;
    }

    @Override
    protected FlexboxLayoutData getLayoutDataForUpdate() {
      return getDesktop().getBenchLayoutData().getCenter().getCenter().copy();
    }

    @Override
    protected void storeLayoutData(FlexboxLayoutData layoutData) {
      BenchLayoutData benchLayoutData = getDesktop().getBenchLayoutData().copy();
      benchLayoutData.getCenter().withCenter(layoutData);
      getDesktop().setBenchLayoutData(benchLayoutData);
    }
  }

  @ClassId("3441dbef-e4d4-4bcb-a919-41fe955f8f53")
  private class BottomForm extends AbstractConfigureBenchLayoutForm<FlexboxLayoutData> {
    @Override
    protected String getConfiguredDisplayViewId() {
      return VIEW_ID_S;
    }

    @Override
    protected FlexboxLayoutData getLayoutDataForUpdate() {
      return getDesktop().getBenchLayoutData().getCenter().getBottom().copy();
    }

    @Override
    protected void storeLayoutData(FlexboxLayoutData layoutData) {
      BenchLayoutData benchLayoutData = getDesktop().getBenchLayoutData().copy();
      benchLayoutData.getCenter().withBottom(layoutData);
      getDesktop().setBenchLayoutData(benchLayoutData);
    }
  }

}
