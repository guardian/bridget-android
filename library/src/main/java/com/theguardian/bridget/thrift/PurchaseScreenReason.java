/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)")
public enum PurchaseScreenReason implements org.apache.thrift.TEnum {
  hideAds(0),
  epic(1);

  private final int value;

  private PurchaseScreenReason(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static PurchaseScreenReason findByValue(int value) { 
    switch (value) {
      case 0:
        return hideAds;
      case 1:
        return epic;
      default:
        return null;
    }
  }
}
