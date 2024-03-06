/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)")
public enum SignInScreenReason implements org.apache.thrift.TEnum {
  saveForLater(0),
  postComment(1),
  recommendComment(2),
  replyToComment(3),
  reportComment(4),
  personaliseHome(5),
  profile(6),
  premiumTier(7),
  passwordChanged(8),
  meteredUser(9),
  signOrRegisterOnThankYou(10),
  followContributorTag(11),
  signInOnAdjustDeeplink(12),
  mandatorySignIn(13);

  private final int value;

  private SignInScreenReason(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static SignInScreenReason findByValue(int value) { 
    switch (value) {
      case 0:
        return saveForLater;
      case 1:
        return postComment;
      case 2:
        return recommendComment;
      case 3:
        return replyToComment;
      case 4:
        return reportComment;
      case 5:
        return personaliseHome;
      case 6:
        return profile;
      case 7:
        return premiumTier;
      case 8:
        return passwordChanged;
      case 9:
        return meteredUser;
      case 10:
        return signOrRegisterOnThankYou;
      case 11:
        return followContributorTag;
      case 12:
        return signInOnAdjustDeeplink;
      case 13:
        return mandatorySignIn;
      default:
        return null;
    }
  }
}
