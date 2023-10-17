import { registerPlugin } from '@capacitor/core';

import type { PopupPluginPlugin } from './definitions';

const PopupPlugin = registerPlugin<PopupPluginPlugin>('PopupPlugin', {
  web: () => import('./web').then(m => new m.PopupPluginWeb()),
});

export * from './definitions';
export { PopupPlugin };
