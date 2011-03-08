/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pyload.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DownloadStatus implements TEnum {
  Finished(0),
  Offline(1),
  Online(2),
  Queued(3),
  Checking(4),
  Waiting(5),
  Reconnected(6),
  Starting(7),
  Failed(8),
  Aborted(9),
  Decrypting(10),
  Custom(11),
  Downloading(12),
  Processing(13),
  Unknown(14);

  private final int value;

  private DownloadStatus(int value) {
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
  public static DownloadStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return Finished;
      case 1:
        return Offline;
      case 2:
        return Online;
      case 3:
        return Queued;
      case 4:
        return Checking;
      case 5:
        return Waiting;
      case 6:
        return Reconnected;
      case 7:
        return Starting;
      case 8:
        return Failed;
      case 9:
        return Aborted;
      case 10:
        return Decrypting;
      case 11:
        return Custom;
      case 12:
        return Downloading;
      case 13:
        return Processing;
      case 14:
        return Unknown;
      default:
        return null;
    }
  }
}
