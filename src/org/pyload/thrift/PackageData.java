/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pyload.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class PackageData implements TBase<PackageData, PackageData._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("PackageData");

  private static final TField PID_FIELD_DESC = new TField("pid", TType.I32, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField FOLDER_FIELD_DESC = new TField("folder", TType.STRING, (short)3);
  private static final TField SITE_FIELD_DESC = new TField("site", TType.STRING, (short)4);
  private static final TField PASSWORD_FIELD_DESC = new TField("password", TType.STRING, (short)5);
  private static final TField DEST_FIELD_DESC = new TField("dest", TType.I32, (short)6);
  private static final TField ORDER_FIELD_DESC = new TField("order", TType.I16, (short)7);
  private static final TField PRIORITY_FIELD_DESC = new TField("priority", TType.BYTE, (short)8);
  private static final TField LINKS_FIELD_DESC = new TField("links", TType.LIST, (short)9);

  public int pid;
  public String name;
  public String folder;
  public String site;
  public String password;
  /**
   * 
   * @see Destination
   */
  public Destination dest;
  public short order;
  public byte priority;
  public List<FileData> links;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PID((short)1, "pid"),
    NAME((short)2, "name"),
    FOLDER((short)3, "folder"),
    SITE((short)4, "site"),
    PASSWORD((short)5, "password"),
    /**
     * 
     * @see Destination
     */
    DEST((short)6, "dest"),
    ORDER((short)7, "order"),
    PRIORITY((short)8, "priority"),
    LINKS((short)9, "links");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PID
          return PID;
        case 2: // NAME
          return NAME;
        case 3: // FOLDER
          return FOLDER;
        case 4: // SITE
          return SITE;
        case 5: // PASSWORD
          return PASSWORD;
        case 6: // DEST
          return DEST;
        case 7: // ORDER
          return ORDER;
        case 8: // PRIORITY
          return PRIORITY;
        case 9: // LINKS
          return LINKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PID_ISSET_ID = 0;
  private static final int __ORDER_ISSET_ID = 1;
  private static final int __PRIORITY_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PID, new FieldMetaData("pid", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32        , "PackageID")));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FOLDER, new FieldMetaData("folder", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SITE, new FieldMetaData("site", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new FieldMetaData("password", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DEST, new FieldMetaData("dest", TFieldRequirementType.DEFAULT, 
        new EnumMetaData(TType.ENUM, Destination.class)));
    tmpMap.put(_Fields.ORDER, new FieldMetaData("order", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.PRIORITY, new FieldMetaData("priority", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BYTE        , "Priority")));
    tmpMap.put(_Fields.LINKS, new FieldMetaData("links", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, FileData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(PackageData.class, metaDataMap);
  }

  public PackageData() {
  }

  public PackageData(
    int pid,
    String name,
    String folder,
    String site,
    String password,
    Destination dest,
    short order,
    byte priority,
    List<FileData> links)
  {
    this();
    this.pid = pid;
    setPidIsSet(true);
    this.name = name;
    this.folder = folder;
    this.site = site;
    this.password = password;
    this.dest = dest;
    this.order = order;
    setOrderIsSet(true);
    this.priority = priority;
    setPriorityIsSet(true);
    this.links = links;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PackageData(PackageData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.pid = other.pid;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetFolder()) {
      this.folder = other.folder;
    }
    if (other.isSetSite()) {
      this.site = other.site;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetDest()) {
      this.dest = other.dest;
    }
    this.order = other.order;
    this.priority = other.priority;
    if (other.isSetLinks()) {
      List<FileData> __this__links = new ArrayList<FileData>();
      for (FileData other_element : other.links) {
        __this__links.add(new FileData(other_element));
      }
      this.links = __this__links;
    }
  }

  public PackageData deepCopy() {
    return new PackageData(this);
  }

  @Override
  public void clear() {
    setPidIsSet(false);
    this.pid = 0;
    this.name = null;
    this.folder = null;
    this.site = null;
    this.password = null;
    this.dest = null;
    setOrderIsSet(false);
    this.order = 0;
    setPriorityIsSet(false);
    this.priority = 0;
    this.links = null;
  }

  public int getPid() {
    return this.pid;
  }

  public PackageData setPid(int pid) {
    this.pid = pid;
    setPidIsSet(true);
    return this;
  }

  public void unsetPid() {
    __isset_bit_vector.clear(__PID_ISSET_ID);
  }

  /** Returns true if field pid is set (has been asigned a value) and false otherwise */
  public boolean isSetPid() {
    return __isset_bit_vector.get(__PID_ISSET_ID);
  }

  public void setPidIsSet(boolean value) {
    __isset_bit_vector.set(__PID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public PackageData setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getFolder() {
    return this.folder;
  }

  public PackageData setFolder(String folder) {
    this.folder = folder;
    return this;
  }

  public void unsetFolder() {
    this.folder = null;
  }

  /** Returns true if field folder is set (has been asigned a value) and false otherwise */
  public boolean isSetFolder() {
    return this.folder != null;
  }

  public void setFolderIsSet(boolean value) {
    if (!value) {
      this.folder = null;
    }
  }

  public String getSite() {
    return this.site;
  }

  public PackageData setSite(String site) {
    this.site = site;
    return this;
  }

  public void unsetSite() {
    this.site = null;
  }

  /** Returns true if field site is set (has been asigned a value) and false otherwise */
  public boolean isSetSite() {
    return this.site != null;
  }

  public void setSiteIsSet(boolean value) {
    if (!value) {
      this.site = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public PackageData setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been asigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  /**
   * 
   * @see Destination
   */
  public Destination getDest() {
    return this.dest;
  }

  /**
   * 
   * @see Destination
   */
  public PackageData setDest(Destination dest) {
    this.dest = dest;
    return this;
  }

  public void unsetDest() {
    this.dest = null;
  }

  /** Returns true if field dest is set (has been asigned a value) and false otherwise */
  public boolean isSetDest() {
    return this.dest != null;
  }

  public void setDestIsSet(boolean value) {
    if (!value) {
      this.dest = null;
    }
  }

  public short getOrder() {
    return this.order;
  }

  public PackageData setOrder(short order) {
    this.order = order;
    setOrderIsSet(true);
    return this;
  }

  public void unsetOrder() {
    __isset_bit_vector.clear(__ORDER_ISSET_ID);
  }

  /** Returns true if field order is set (has been asigned a value) and false otherwise */
  public boolean isSetOrder() {
    return __isset_bit_vector.get(__ORDER_ISSET_ID);
  }

  public void setOrderIsSet(boolean value) {
    __isset_bit_vector.set(__ORDER_ISSET_ID, value);
  }

  public byte getPriority() {
    return this.priority;
  }

  public PackageData setPriority(byte priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bit_vector.clear(__PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been asigned a value) and false otherwise */
  public boolean isSetPriority() {
    return __isset_bit_vector.get(__PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bit_vector.set(__PRIORITY_ISSET_ID, value);
  }

  public int getLinksSize() {
    return (this.links == null) ? 0 : this.links.size();
  }

  public java.util.Iterator<FileData> getLinksIterator() {
    return (this.links == null) ? null : this.links.iterator();
  }

  public void addToLinks(FileData elem) {
    if (this.links == null) {
      this.links = new ArrayList<FileData>();
    }
    this.links.add(elem);
  }

  public List<FileData> getLinks() {
    return this.links;
  }

  public PackageData setLinks(List<FileData> links) {
    this.links = links;
    return this;
  }

  public void unsetLinks() {
    this.links = null;
  }

  /** Returns true if field links is set (has been asigned a value) and false otherwise */
  public boolean isSetLinks() {
    return this.links != null;
  }

  public void setLinksIsSet(boolean value) {
    if (!value) {
      this.links = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case FOLDER:
      if (value == null) {
        unsetFolder();
      } else {
        setFolder((String)value);
      }
      break;

    case SITE:
      if (value == null) {
        unsetSite();
      } else {
        setSite((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case DEST:
      if (value == null) {
        unsetDest();
      } else {
        setDest((Destination)value);
      }
      break;

    case ORDER:
      if (value == null) {
        unsetOrder();
      } else {
        setOrder((Short)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Byte)value);
      }
      break;

    case LINKS:
      if (value == null) {
        unsetLinks();
      } else {
        setLinks((List<FileData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID:
      return new Integer(getPid());

    case NAME:
      return getName();

    case FOLDER:
      return getFolder();

    case SITE:
      return getSite();

    case PASSWORD:
      return getPassword();

    case DEST:
      return getDest();

    case ORDER:
      return new Short(getOrder());

    case PRIORITY:
      return new Byte(getPriority());

    case LINKS:
      return getLinks();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PID:
      return isSetPid();
    case NAME:
      return isSetName();
    case FOLDER:
      return isSetFolder();
    case SITE:
      return isSetSite();
    case PASSWORD:
      return isSetPassword();
    case DEST:
      return isSetDest();
    case ORDER:
      return isSetOrder();
    case PRIORITY:
      return isSetPriority();
    case LINKS:
      return isSetLinks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PackageData)
      return this.equals((PackageData)that);
    return false;
  }

  public boolean equals(PackageData that) {
    if (that == null)
      return false;

    boolean this_present_pid = true;
    boolean that_present_pid = true;
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_folder = true && this.isSetFolder();
    boolean that_present_folder = true && that.isSetFolder();
    if (this_present_folder || that_present_folder) {
      if (!(this_present_folder && that_present_folder))
        return false;
      if (!this.folder.equals(that.folder))
        return false;
    }

    boolean this_present_site = true && this.isSetSite();
    boolean that_present_site = true && that.isSetSite();
    if (this_present_site || that_present_site) {
      if (!(this_present_site && that_present_site))
        return false;
      if (!this.site.equals(that.site))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_dest = true && this.isSetDest();
    boolean that_present_dest = true && that.isSetDest();
    if (this_present_dest || that_present_dest) {
      if (!(this_present_dest && that_present_dest))
        return false;
      if (!this.dest.equals(that.dest))
        return false;
    }

    boolean this_present_order = true;
    boolean that_present_order = true;
    if (this_present_order || that_present_order) {
      if (!(this_present_order && that_present_order))
        return false;
      if (this.order != that.order)
        return false;
    }

    boolean this_present_priority = true;
    boolean that_present_priority = true;
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    boolean this_present_links = true && this.isSetLinks();
    boolean that_present_links = true && that.isSetLinks();
    if (this_present_links || that_present_links) {
      if (!(this_present_links && that_present_links))
        return false;
      if (!this.links.equals(that.links))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PackageData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PackageData typedOther = (PackageData)other;

    lastComparison = Boolean.valueOf(isSetPid()).compareTo(typedOther.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = TBaseHelper.compareTo(this.pid, typedOther.pid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFolder()).compareTo(typedOther.isSetFolder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFolder()) {
      lastComparison = TBaseHelper.compareTo(this.folder, typedOther.folder);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSite()).compareTo(typedOther.isSetSite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSite()) {
      lastComparison = TBaseHelper.compareTo(this.site, typedOther.site);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(typedOther.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = TBaseHelper.compareTo(this.password, typedOther.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDest()).compareTo(typedOther.isSetDest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest()) {
      lastComparison = TBaseHelper.compareTo(this.dest, typedOther.dest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrder()).compareTo(typedOther.isSetOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrder()) {
      lastComparison = TBaseHelper.compareTo(this.order, typedOther.order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(typedOther.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = TBaseHelper.compareTo(this.priority, typedOther.priority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinks()).compareTo(typedOther.isSetLinks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinks()) {
      lastComparison = TBaseHelper.compareTo(this.links, typedOther.links);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PID
          if (field.type == TType.I32) {
            this.pid = iprot.readI32();
            setPidIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FOLDER
          if (field.type == TType.STRING) {
            this.folder = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SITE
          if (field.type == TType.STRING) {
            this.site = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PASSWORD
          if (field.type == TType.STRING) {
            this.password = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DEST
          if (field.type == TType.I32) {
            this.dest = Destination.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // ORDER
          if (field.type == TType.I16) {
            this.order = iprot.readI16();
            setOrderIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // PRIORITY
          if (field.type == TType.BYTE) {
            this.priority = iprot.readByte();
            setPriorityIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // LINKS
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.links = new ArrayList<FileData>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                FileData _elem6;
                _elem6 = new FileData();
                _elem6.read(iprot);
                this.links.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(PID_FIELD_DESC);
    oprot.writeI32(this.pid);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.folder != null) {
      oprot.writeFieldBegin(FOLDER_FIELD_DESC);
      oprot.writeString(this.folder);
      oprot.writeFieldEnd();
    }
    if (this.site != null) {
      oprot.writeFieldBegin(SITE_FIELD_DESC);
      oprot.writeString(this.site);
      oprot.writeFieldEnd();
    }
    if (this.password != null) {
      oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
      oprot.writeString(this.password);
      oprot.writeFieldEnd();
    }
    if (this.dest != null) {
      oprot.writeFieldBegin(DEST_FIELD_DESC);
      oprot.writeI32(this.dest.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ORDER_FIELD_DESC);
    oprot.writeI16(this.order);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
    oprot.writeByte(this.priority);
    oprot.writeFieldEnd();
    if (this.links != null) {
      oprot.writeFieldBegin(LINKS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.links.size()));
        for (FileData _iter7 : this.links)
        {
          _iter7.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PackageData(");
    boolean first = true;

    sb.append("pid:");
    sb.append(this.pid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("folder:");
    if (this.folder == null) {
      sb.append("null");
    } else {
      sb.append(this.folder);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("site:");
    if (this.site == null) {
      sb.append("null");
    } else {
      sb.append(this.site);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dest:");
    if (this.dest == null) {
      sb.append("null");
    } else {
      sb.append(this.dest);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("order:");
    sb.append(this.order);
    first = false;
    if (!first) sb.append(", ");
    sb.append("priority:");
    sb.append(this.priority);
    first = false;
    if (!first) sb.append(", ");
    sb.append("links:");
    if (this.links == null) {
      sb.append("null");
    } else {
      sb.append(this.links);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

