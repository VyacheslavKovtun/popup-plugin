import { WebPlugin } from '@capacitor/core';

import type { PopupPluginPlugin } from './definitions';

export class PopupPluginWeb extends WebPlugin implements PopupPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
