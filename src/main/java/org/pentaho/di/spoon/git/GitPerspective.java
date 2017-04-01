package org.pentaho.di.spoon.git;

import java.io.InputStream;
import java.util.List;
import java.util.Locale;

import org.eclipse.swt.widgets.Composite;
import org.pentaho.di.core.EngineMetaInterface;
import org.pentaho.di.i18n.BaseMessages;
import org.pentaho.di.ui.spoon.SpoonPerspectiveImageProvider;
import org.pentaho.di.ui.spoon.SpoonPerspectiveListener;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulException;
import org.pentaho.ui.xul.XulOverlay;
import org.pentaho.ui.xul.impl.AbstractXulEventHandler;
import org.pentaho.ui.xul.impl.XulEventHandler;
import org.pentaho.ui.xul.swt.SwtXulLoader;

public class GitPerspective implements SpoonPerspectiveImageProvider {

  final String PERSPECTIVE_ID = "010-git"; //$NON-NLS-1$
  final String PERSPECTIVE_NAME = "gitPerspective"; //$NON-NLS-1$

  XulDomContainer container;
  XulEventHandler controller;

  public GitPerspective() throws XulException {
    controller = new GitController();
    SwtXulLoader loader = new SwtXulLoader();
    loader.registerClassLoader( getClass().getClassLoader() );
    container = loader.loadXul( "org/pentaho/di/spoon/git/perspective.xul" );
    controller.setXulDomContainer( container );
  }

  @Override
  public String getId() {
    return PERSPECTIVE_ID;
  }

  public String getName() {
    return PERSPECTIVE_NAME;
  }

  @Override
  public Composite getUI() {
    return (Composite) container.getDocumentRoot().getRootElement().getFirstChild().getManagedObject();
  }

  @Override
  public String getDisplayName(Locale l) {
    return "Git";
  }

  @Override
  public InputStream getPerspectiveIcon() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setActive(boolean active) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<XulOverlay> getOverlays() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<XulEventHandler> getEventHandlers() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addPerspectiveListener(SpoonPerspectiveListener listener) {
    // TODO Auto-generated method stub

  }

  @Override
  public EngineMetaInterface getActiveMeta() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getPerspectiveIconPath() {
    // TODO Auto-generated method stub
    return null;
  }

}
