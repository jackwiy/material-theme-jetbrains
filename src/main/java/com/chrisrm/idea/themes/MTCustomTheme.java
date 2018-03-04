/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes;

import com.chrisrm.idea.MTAbstractTheme;
import com.chrisrm.idea.MTCustomThemeConfig;
import org.jetbrains.annotations.NotNull;

public class MTCustomTheme extends MTAbstractTheme {
  public static final String BACKGROUND = "263238"; // 38, 50, 56
  public static final String FOREGROUND = "B0BEC5"; // 176, 190, 197
  public static final String TEXT = "607D8B"; // 96, 125, 139
  public static final String SELECTION_BACKGROUND = "546E7A"; // 84, 110, 122
  public static final String SELECTION_FOREGROUND = "FFFFFF";
  public static final String DISABLED = "2E3C43"; // 65, 89, 103

  public MTCustomTheme() {
    super("mt.custom", "Material Custom Theme", true);
  }

  @NotNull
  @Override
  public String getSelectionBackground() {
    return MTCustomTheme.SELECTION_BACKGROUND;
  }

  @NotNull
  @Override
  public String getDisabled() {
    return MTCustomTheme.DISABLED;
  }

  @Override
  protected String[] getInactiveResources() {
    return new String[]{
        "MenuBar.darcula.borderColor",
        "MenuBar.darcula.borderShadowColor",
        "Separator.foreground",
        "Button.mt.color1",
        "Button.mt.background",
        "material.disabled",
        "material.mergeCommits"
    };
  }

  @Override
  protected String[] getSelectionForegroundResources() {
    return new String[]{
        "mt.custom.selectionForeground",
        "Menu.selectionForeground",
        "Menu.acceleratorSelectionForeground",
        "MenuItem.selectionForeground",
        "MenuItem.acceleratorSelectionForeground",
        "Table.selectionForeground",
        "TextField.selectionForeground",
        "PasswordField.selectionForeground",
        "Button.mt.selectedForeground",
        "TextArea.selectionForeground",
        "List.selectionForeground",
        "ComboBox.selectionForeground",
        "FormattedTextField.selectionForeground",
        "CheckBoxMenuItem.selectionForeground",
        "TextPane.selectionForeground",
        "EditorPane.selectionForeground",
        "Tree.selectionForeground",
        "TableHeader.focusCellForeground",
        "Label.selectedForeground",
        "Button.darcula.selectedButtonForeground"
    };
  }

  @Override
  protected String[] getSelectionBackgroundResources() {
    return new String[]{
        "mt.custom.selectionBackgroundInactive",
        "mt.custom.selectionInactiveBackground",
        "Menu.selectionBackground",
        "MenuItem.selectionBackground",
        "RadioButtonMenuItem.selectionBackground",
        "CheckBoxMenuItem.selectionBackground",
        "EditorPane.selectionBackground",
        "Autocomplete.selectionbackground",
        "EditorPane.inactiveForeground",
        "TabbedPane.selected",
        "ScrollBar.thumb"
    };
  }

  @Override
  protected String[] getTextResources() {
    return new String[]{
        "Menu.acceleratorForeground",
        "MenuItem.acceleratorForeground",
        "TextField.separatorColorDisabled",
        "Button.foreground",
        "Button.mt.foreground",
        "material.tagColor",
        "material.primaryColor",
        "SearchEverywhere.shortcutForeground",
        "Tree.foreground"
    };
  }

  @Override
  protected String[] getBackgroundResources() {
    return new String[]{
        "mt.custom.background",
        "mt.custom.textBackground",
        "mt.custom.inactiveBackground",
        "window",
        "activeCaption",
        "control",
        "PopupMenu.translucentBackground",
        "EditorPane.inactiveBackground",
        "Table.background",
        "Table.gridColor",
        "MenuBar.disabledBackground",
        "MenuBar.shadow",
        "Desktop.background",
        "PopupMenu.background",
        "Separator.background",
        "MenuBar.background",
        "TabbedPane.highlight",
        "TabbedPane.darkShadow",
        "TabbedPane.shadow",
        "TabbedPane.borderColor",
        "TextField.background",
        "PasswordField.background",
        "FormattedTextField.background",
        "TextArea.background",
        "CheckBox.darcula.backgroundColor1",
        "CheckBox.darcula.backgroundColor2",
        "CheckBox.darcula.checkSignColor",
        "CheckBox.darcula.shadowColor",
        "CheckBox.darcula.shadowColorDisabled",
        "CheckBox.darcula.focusedArmed.backgroundColor1",
        "CheckBox.darcula.focusedArmed.backgroundColor2",
        "CheckBox.darcula.focused.backgroundColor1",
        "CheckBox.darcula.focused.backgroundColor2",
        "ComboBox.background",
        "ComboBox.disabledBackground",
        "ComboBox.arrowFillColor",
        "RadioButton.darcula.selectionDisabledColor",
        "StatusBar.topColor",
        "StatusBar.top2Color",
        "StatusBar.bottomColor",
        "Button.background",
        "Button.darcula.color1",
        "Button.darcula.color2",
        "Button.darcula.disabledText.shadow",
        "ToolTip.background",
        "Spinner.background",
        "SplitPane.highlight",
        "Label.background",
        //        "Panel.background",
        "SidePanel.background",
        "DialogWrapper.southPanelDivider",
        "OnePixelDivider.background",
        "Dialog.titleColor",
        "SearchEverywhere.background",
        "RadioButton.background",
        "CheckBoxMenuItem.background",
        //        "MenuItem.background",
        "RadioButtonMenuItem.background",
        "CheckBox.background",
        "ColorChooser.background",
        "Slider.background",
        "TabbedPane.background",
        //        "Menu.background",
        "OptionPane.background",
        "ToolWindow.header.background",
        "ToolWindow.header.closeButton.background",
        "material.tab.backgroundColor",
        "material.background"
    };
  }

  @Override
  protected String[] getForegroundResources() {
    return new String[]{
        "mt.custom.foreground",
        "mt.custom.textForeground",
        "mt.custom.selectionForegroundInactive",
        "mt.custom.selectionInactiveForeground",
        "text",
        "textText",
        "textInactiveText",
        "infoText",
        "controlText",
        "OptionPane.messageForeground",
        "Menu.foreground",
        "MenuItem.foreground",
        "Label.foreground",
        "Label.disabledForeground",
        "Label.selectedDisabledForeground",
        "EditorPane.inactiveForeground",
        "CheckBox.foreground",
        "ComboBox.foreground",
        "RadioButton.foreground",
        "ColorChooser.foreground",
        "MenuBar.foreground",
        "RadioButtonMenuItem.foreground",
        "CheckBoxMenuItem.foreground",
        "MenuItem.foreground",
        //        "OptionPane.foreground",
        "PopupMenu.foreground",
        "Spinner.foreground",
        "TabbedPane.foreground",
        "TextField.foreground",
        "FormattedTextField.foreground",
        "PasswordField.foreground",
        "TextArea.foreground",
        "TextPane.foreground",
        "EditorPane.foreground",
        "ToolBar.foreground",
        "ToolTip.foreground",
        "List.foreground",
        "SearchEverywhere.foreground",
        "Table.foreground",
        "TableHeader.foreground",
        "ToggleButton.foreground",
        "Table.sortIconColor",
        "material.branchColor",
        "material.foreground",
        "TitledBorder.titleColor"
    };
  }

  @Override
  protected String getNotificationsColorString() {
    return MTCustomThemeConfig.getInstance().getNotificationsColorString();
  }

  @Override
  protected String getTreeSelectionColorString() {
    return MTCustomThemeConfig.getInstance().getTreeSelectionColorString();
  }

  @Override
  protected String getHighlightColorString() {
    return MTCustomThemeConfig.getInstance().getHighlightColorString();
  }

  @Override
  protected String getSecondBorderColorString() {
    return MTCustomThemeConfig.getInstance().getSecondBorderColorString();
  }

  @Override
  protected String getTableSelectedColorString() {
    return MTCustomThemeConfig.getInstance().getTableSelectedColorString();
  }

  @Override
  protected String getContrastColorString() {
    return MTCustomThemeConfig.getInstance().getContrastColorString();
  }

  @Override
  protected String getDisabledColorString() {
    return MTCustomThemeConfig.getInstance().getDisabledColorString();
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSecondaryBackgroundColorString();
  }

  @Override
  protected String getCaretColorString() {
    return MTCustomThemeConfig.getInstance().getCaretColorString();
  }

  @Override
  protected String getInactiveColorString() {
    return MTCustomThemeConfig.getInstance().getInactiveColorString();
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionForegroundColorString();
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionBackgroundColorString();
  }

  @Override
  protected String getTextColorString() {
    return MTCustomThemeConfig.getInstance().getTextColorString();
  }

  @Override
  protected String getForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getForegroundColorString();
  }

  @Override
  protected String getBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getBackgroundColorString();
  }

  @Override
  public boolean isCustom() {
    return true;
  }
}
