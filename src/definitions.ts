export interface PopupPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;

  showPopup(options: { message: string}): Promise<{ message: string }>;
}
