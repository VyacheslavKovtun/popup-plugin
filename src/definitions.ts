export interface PopupPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
