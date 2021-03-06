package minestrapp.inventories;

import minestrapp.item.ItemBackpack;
import minestrapp.item.ItemSeedBag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;

public class InventorySeedBag implements IInventory
{
	private String name = "Seed Bag Inventory";

	private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);

	public final ItemStack invStack;

	public InventorySeedBag(ItemStack stack)
	{
		this.invStack = stack;
		ItemSeedBag item = (ItemSeedBag) stack.getItem();
		if (!this.invStack.hasTagCompound()) {
			this.invStack.setTagCompound(new NBTTagCompound());
		}
		this.readFromNBT(this.invStack.getTagCompound());
	}

	@Override
	public int getSizeInventory() {
		return this.inventory.size();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return (ItemStack)this.inventory.get(slot);
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount) {
		return ItemStackHelper.getAndSplit(this.inventory, slot, amount);
	}

	@Override
	public ItemStack removeStackFromSlot(int slot) {
		return ItemStackHelper.getAndRemove(this.inventory, slot);
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		this.inventory.set(slot, stack);
		this.markDirty();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean hasCustomName() {
		return this.name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 576;
	}

	@Override
	public void markDirty() {
		this.writeToNBT(this.invStack.getTagCompound());
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
		return itemstack.getItem() instanceof ItemBackpack == false && itemstack.getItem() instanceof ItemShulkerBox == false && itemstack.getItem() instanceof ItemSeedBag == false;
	}

	public void readFromNBT(NBTTagCompound compound) {
		this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.inventory);
	}

	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		ItemStackHelper.saveAllItems(compound, this.inventory);
		return compound;
	}


	@Override
	public void openInventory(EntityPlayer player) {
	}

	@Override
	public void closeInventory(EntityPlayer player) {
	}

	@Override
	public int getField(int id){
		return 0;
	}

	@Override
	public void setField(int id, int value) {
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		this.inventory.clear();
	}

	@Override
	public ITextComponent getDisplayName() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		return false;
	}
}