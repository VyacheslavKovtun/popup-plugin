# popup-plugin

test plugin

## Install

```bash
npm install popup-plugin
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`showPopup(...)`](#showpopup)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### showPopup(...)

```typescript
showPopup(options: { message: string; }) => Promise<{ message: string; }>
```

| Param         | Type                              |
| ------------- | --------------------------------- |
| **`options`** | <code>{ message: string; }</code> |

**Returns:** <code>Promise&lt;{ message: string; }&gt;</code>

--------------------

</docgen-api>
