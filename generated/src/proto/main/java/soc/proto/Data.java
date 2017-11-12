// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package soc.proto;

public final class Data {
  private Data() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * <pre>
   * Structs here are suffixed "Data" since we eventually want them used in the java code. Many struct names will then get
   *the same name as its OO counterparts. As in Java OO is central, I choose to suffix the data.
   * </pre>
   *
   * Protobuf enum {@code ResourceType}
   */
  public enum ResourceType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * For now, we're still tied to the integer values. Therefore I want the values to be the same as we currently use
     * them until the integer dependencies are refactored out.
     * </pre>
     *
     * <code>NOT_YET_USED = 0;</code>
     */
    NOT_YET_USED(0),
    /**
     * <code>CLAY = 1;</code>
     */
    CLAY(1),
    /**
     * <code>ORE = 2;</code>
     */
    ORE(2),
    /**
     * <code>SHEEP = 3;</code>
     */
    SHEEP(3),
    /**
     * <code>WHEAT = 4;</code>
     */
    WHEAT(4),
    /**
     * <code>WOOD = 5;</code>
     */
    WOOD(5),
    /**
     * <pre>
     * TODO: shares a slot with GOLD in some instances
     * </pre>
     *
     * <code>UNKNOWN = 6;</code>
     */
    UNKNOWN(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * For now, we're still tied to the integer values. Therefore I want the values to be the same as we currently use
     * them until the integer dependencies are refactored out.
     * </pre>
     *
     * <code>NOT_YET_USED = 0;</code>
     */
    public static final int NOT_YET_USED_VALUE = 0;
    /**
     * <code>CLAY = 1;</code>
     */
    public static final int CLAY_VALUE = 1;
    /**
     * <code>ORE = 2;</code>
     */
    public static final int ORE_VALUE = 2;
    /**
     * <code>SHEEP = 3;</code>
     */
    public static final int SHEEP_VALUE = 3;
    /**
     * <code>WHEAT = 4;</code>
     */
    public static final int WHEAT_VALUE = 4;
    /**
     * <code>WOOD = 5;</code>
     */
    public static final int WOOD_VALUE = 5;
    /**
     * <pre>
     * TODO: shares a slot with GOLD in some instances
     * </pre>
     *
     * <code>UNKNOWN = 6;</code>
     */
    public static final int UNKNOWN_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResourceType valueOf(int value) {
      return forNumber(value);
    }

    public static ResourceType forNumber(int value) {
      switch (value) {
        case 0: return NOT_YET_USED;
        case 1: return CLAY;
        case 2: return ORE;
        case 3: return SHEEP;
        case 4: return WHEAT;
        case 5: return WOOD;
        case 6: return UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
            public ResourceType findValueByNumber(int number) {
              return ResourceType.forNumber(number);
            }
          };

    private final int value;

    private ResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ResourceType)
  }

  /**
   * <pre>
   * Game state constants for {&#64;code SOCGame}.
   * For general docs about game states see {&#64;link soc.game.SOCGame#NEW}.
   * Per-state docs may eventually be transferred here from SOCGame.
   * </pre>
   *
   * Protobuf enum {@code GameState}
   */
  public enum GameState
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * New game
     * </pre>
     *
     * <code>NEW = 0;</code>
     */
    NEW(0),
    /**
     * <pre>
     * Ready to start playing
     * </pre>
     *
     * <code>READY = 1;</code>
     */
    READY(1),
    /**
     * <pre>
     * Game reset: Waiting for bots to leave old game
     * </pre>
     *
     * <code>READY_RESET_WAIT_ROBOT_DISMISS = 4;</code>
     */
    READY_RESET_WAIT_ROBOT_DISMISS(4),
    /**
     * <pre>
     * Players place 1st settlement
     * </pre>
     *
     * <code>START1A = 5;</code>
     */
    START1A(5),
    /**
     * <pre>
     * Players place 1st road
     * </pre>
     *
     * <code>START1B = 6;</code>
     */
    START1B(6),
    /**
     * <pre>
     * Players place 2nd settlement
     * </pre>
     *
     * <code>START2A = 10;</code>
     */
    START2A(10),
    /**
     * <pre>
     * Gold Hex resource pick during initial placement
     * </pre>
     *
     * <code>STARTS_WAITING_FOR_PICK_GOLD_RESOURCE = 14;</code>
     */
    STARTS_WAITING_FOR_PICK_GOLD_RESOURCE(14),
    /**
     * <pre>
     * Players place 2nd road
     * </pre>
     *
     * <code>START2B = 11;</code>
     */
    START2B(11),
    /**
     * <pre>
     * Players place 3rd settlement ({&#64;link SOCGameOption#K_SC_3IP _SC_3IP})
     * </pre>
     *
     * <code>START3A = 12;</code>
     */
    START3A(12),
    /**
     * <pre>
     * Players place 3rd road
     * </pre>
     *
     * <code>START3B = 13;</code>
     */
    START3B(13),
    /**
     * <pre>
     * Roll or play card
     * </pre>
     *
     * <code>ROLL_OR_CARD = 15;</code>
     */
    ROLL_OR_CARD(15),
    /**
     * <pre>
     * Done rolling
     * </pre>
     *
     * <code>PLAY1 = 20;</code>
     */
    PLAY1(20),
    /**
     * <code>PLACING_ROAD = 30;</code>
     */
    PLACING_ROAD(30),
    /**
     * <code>PLACING_SETTLEMENT = 31;</code>
     */
    PLACING_SETTLEMENT(31),
    /**
     * <code>PLACING_CITY = 32;</code>
     */
    PLACING_CITY(32),
    /**
     * <code>PLACING_ROBBER = 33;</code>
     */
    PLACING_ROBBER(33),
    /**
     * <code>PLACING_PIRATE = 34;</code>
     */
    PLACING_PIRATE(34),
    /**
     * <code>PLACING_SHIP = 35;</code>
     */
    PLACING_SHIP(35),
    /**
     * <code>PLACING_FREE_ROAD1 = 40;</code>
     */
    PLACING_FREE_ROAD1(40),
    /**
     * <code>PLACING_FREE_ROAD2 = 41;</code>
     */
    PLACING_FREE_ROAD2(41),
    /**
     * <code>PLACING_INV_ITEM = 42;</code>
     */
    PLACING_INV_ITEM(42),
    /**
     * <code>WAITING_FOR_DISCARDS = 50;</code>
     */
    WAITING_FOR_DISCARDS(50),
    /**
     * <code>WAITING_FOR_ROB_CHOOSE_PLAYER = 51;</code>
     */
    WAITING_FOR_ROB_CHOOSE_PLAYER(51),
    /**
     * <code>WAITING_FOR_DISCOVERY = 52;</code>
     */
    WAITING_FOR_DISCOVERY(52),
    /**
     * <code>WAITING_FOR_MONOPOLY = 53;</code>
     */
    WAITING_FOR_MONOPOLY(53),
    /**
     * <code>WAITING_FOR_ROBBER_OR_PIRATE = 54;</code>
     */
    WAITING_FOR_ROBBER_OR_PIRATE(54),
    /**
     * <code>WAITING_FOR_ROB_CLOTH_OR_RESOURCE = 55;</code>
     */
    WAITING_FOR_ROB_CLOTH_OR_RESOURCE(55),
    /**
     * <code>WAITING_FOR_PICK_GOLD_RESOURCE = 56;</code>
     */
    WAITING_FOR_PICK_GOLD_RESOURCE(56),
    /**
     * <code>SPECIAL_BUILDING = 100;</code>
     */
    SPECIAL_BUILDING(100),
    /**
     * <pre>
     * The game is over
     * </pre>
     *
     * <code>OVER = 1000;</code>
     */
    OVER(1000),
    /**
     * <pre>
     * Old game object, a new game with same name exists
     * </pre>
     *
     * <code>RESET_OLD = 1001;</code>
     */
    RESET_OLD(1001),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * New game
     * </pre>
     *
     * <code>NEW = 0;</code>
     */
    public static final int NEW_VALUE = 0;
    /**
     * <pre>
     * Ready to start playing
     * </pre>
     *
     * <code>READY = 1;</code>
     */
    public static final int READY_VALUE = 1;
    /**
     * <pre>
     * Game reset: Waiting for bots to leave old game
     * </pre>
     *
     * <code>READY_RESET_WAIT_ROBOT_DISMISS = 4;</code>
     */
    public static final int READY_RESET_WAIT_ROBOT_DISMISS_VALUE = 4;
    /**
     * <pre>
     * Players place 1st settlement
     * </pre>
     *
     * <code>START1A = 5;</code>
     */
    public static final int START1A_VALUE = 5;
    /**
     * <pre>
     * Players place 1st road
     * </pre>
     *
     * <code>START1B = 6;</code>
     */
    public static final int START1B_VALUE = 6;
    /**
     * <pre>
     * Players place 2nd settlement
     * </pre>
     *
     * <code>START2A = 10;</code>
     */
    public static final int START2A_VALUE = 10;
    /**
     * <pre>
     * Gold Hex resource pick during initial placement
     * </pre>
     *
     * <code>STARTS_WAITING_FOR_PICK_GOLD_RESOURCE = 14;</code>
     */
    public static final int STARTS_WAITING_FOR_PICK_GOLD_RESOURCE_VALUE = 14;
    /**
     * <pre>
     * Players place 2nd road
     * </pre>
     *
     * <code>START2B = 11;</code>
     */
    public static final int START2B_VALUE = 11;
    /**
     * <pre>
     * Players place 3rd settlement ({&#64;link SOCGameOption#K_SC_3IP _SC_3IP})
     * </pre>
     *
     * <code>START3A = 12;</code>
     */
    public static final int START3A_VALUE = 12;
    /**
     * <pre>
     * Players place 3rd road
     * </pre>
     *
     * <code>START3B = 13;</code>
     */
    public static final int START3B_VALUE = 13;
    /**
     * <pre>
     * Roll or play card
     * </pre>
     *
     * <code>ROLL_OR_CARD = 15;</code>
     */
    public static final int ROLL_OR_CARD_VALUE = 15;
    /**
     * <pre>
     * Done rolling
     * </pre>
     *
     * <code>PLAY1 = 20;</code>
     */
    public static final int PLAY1_VALUE = 20;
    /**
     * <code>PLACING_ROAD = 30;</code>
     */
    public static final int PLACING_ROAD_VALUE = 30;
    /**
     * <code>PLACING_SETTLEMENT = 31;</code>
     */
    public static final int PLACING_SETTLEMENT_VALUE = 31;
    /**
     * <code>PLACING_CITY = 32;</code>
     */
    public static final int PLACING_CITY_VALUE = 32;
    /**
     * <code>PLACING_ROBBER = 33;</code>
     */
    public static final int PLACING_ROBBER_VALUE = 33;
    /**
     * <code>PLACING_PIRATE = 34;</code>
     */
    public static final int PLACING_PIRATE_VALUE = 34;
    /**
     * <code>PLACING_SHIP = 35;</code>
     */
    public static final int PLACING_SHIP_VALUE = 35;
    /**
     * <code>PLACING_FREE_ROAD1 = 40;</code>
     */
    public static final int PLACING_FREE_ROAD1_VALUE = 40;
    /**
     * <code>PLACING_FREE_ROAD2 = 41;</code>
     */
    public static final int PLACING_FREE_ROAD2_VALUE = 41;
    /**
     * <code>PLACING_INV_ITEM = 42;</code>
     */
    public static final int PLACING_INV_ITEM_VALUE = 42;
    /**
     * <code>WAITING_FOR_DISCARDS = 50;</code>
     */
    public static final int WAITING_FOR_DISCARDS_VALUE = 50;
    /**
     * <code>WAITING_FOR_ROB_CHOOSE_PLAYER = 51;</code>
     */
    public static final int WAITING_FOR_ROB_CHOOSE_PLAYER_VALUE = 51;
    /**
     * <code>WAITING_FOR_DISCOVERY = 52;</code>
     */
    public static final int WAITING_FOR_DISCOVERY_VALUE = 52;
    /**
     * <code>WAITING_FOR_MONOPOLY = 53;</code>
     */
    public static final int WAITING_FOR_MONOPOLY_VALUE = 53;
    /**
     * <code>WAITING_FOR_ROBBER_OR_PIRATE = 54;</code>
     */
    public static final int WAITING_FOR_ROBBER_OR_PIRATE_VALUE = 54;
    /**
     * <code>WAITING_FOR_ROB_CLOTH_OR_RESOURCE = 55;</code>
     */
    public static final int WAITING_FOR_ROB_CLOTH_OR_RESOURCE_VALUE = 55;
    /**
     * <code>WAITING_FOR_PICK_GOLD_RESOURCE = 56;</code>
     */
    public static final int WAITING_FOR_PICK_GOLD_RESOURCE_VALUE = 56;
    /**
     * <code>SPECIAL_BUILDING = 100;</code>
     */
    public static final int SPECIAL_BUILDING_VALUE = 100;
    /**
     * <pre>
     * The game is over
     * </pre>
     *
     * <code>OVER = 1000;</code>
     */
    public static final int OVER_VALUE = 1000;
    /**
     * <pre>
     * Old game object, a new game with same name exists
     * </pre>
     *
     * <code>RESET_OLD = 1001;</code>
     */
    public static final int RESET_OLD_VALUE = 1001;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameState valueOf(int value) {
      return forNumber(value);
    }

    public static GameState forNumber(int value) {
      switch (value) {
        case 0: return NEW;
        case 1: return READY;
        case 4: return READY_RESET_WAIT_ROBOT_DISMISS;
        case 5: return START1A;
        case 6: return START1B;
        case 10: return START2A;
        case 14: return STARTS_WAITING_FOR_PICK_GOLD_RESOURCE;
        case 11: return START2B;
        case 12: return START3A;
        case 13: return START3B;
        case 15: return ROLL_OR_CARD;
        case 20: return PLAY1;
        case 30: return PLACING_ROAD;
        case 31: return PLACING_SETTLEMENT;
        case 32: return PLACING_CITY;
        case 33: return PLACING_ROBBER;
        case 34: return PLACING_PIRATE;
        case 35: return PLACING_SHIP;
        case 40: return PLACING_FREE_ROAD1;
        case 41: return PLACING_FREE_ROAD2;
        case 42: return PLACING_INV_ITEM;
        case 50: return WAITING_FOR_DISCARDS;
        case 51: return WAITING_FOR_ROB_CHOOSE_PLAYER;
        case 52: return WAITING_FOR_DISCOVERY;
        case 53: return WAITING_FOR_MONOPOLY;
        case 54: return WAITING_FOR_ROBBER_OR_PIRATE;
        case 55: return WAITING_FOR_ROB_CLOTH_OR_RESOURCE;
        case 56: return WAITING_FOR_PICK_GOLD_RESOURCE;
        case 100: return SPECIAL_BUILDING;
        case 1000: return OVER;
        case 1001: return RESET_OLD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameState>() {
            public GameState findValueByNumber(int number) {
              return GameState.forNumber(number);
            }
          };

    private final int value;

    private GameState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GameState)
  }

  /**
   * <pre>
   * Seat lock states for locking/unlocking.
   * Note different meanings while game is forming
   * (GameState NEW) versus already active.
   * </pre>
   *
   * Protobuf enum {@code SeatLockState}
   */
  public enum SeatLockState
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * Seat not locked.
     * If game is forming, if this seat is empty when the game starts, a bot can sit here.
     * If game is active, a newly-joining player can take over a bot in this seat.
     * </pre>
     *
     * <code>UNLOCKED = 0;</code>
     */
    UNLOCKED(0),
    /**
     * <pre>
     * Seat is locked.
     * If game is forming, a bot will not sit here when the game starts.
     * If game is active, a newly-joining player can't take over a bot in this seat.
     * </pre>
     *
     * <code>LOCKED = 1;</code>
     */
    LOCKED(1),
    /**
     * <pre>
     * If this active game is reset, a robot will not take this seat, it will be left vacant.
     * Useful for resetting a game to play again with fewer robots, if a robot is currently sitting here.
     * Not a valid seat lock state if game is still forming.
     *&lt;P&gt;
     * This feature was added in v2.0.00; before that version, the seat lock state was
     * boolean (UNLOCKED or LOCKED).  Game resets included all robots unless their seat
     * was LOCKED at the time of reset.
     * </pre>
     *
     * <code>CLEAR_ON_RESET = 2;</code>
     */
    CLEAR_ON_RESET(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Seat not locked.
     * If game is forming, if this seat is empty when the game starts, a bot can sit here.
     * If game is active, a newly-joining player can take over a bot in this seat.
     * </pre>
     *
     * <code>UNLOCKED = 0;</code>
     */
    public static final int UNLOCKED_VALUE = 0;
    /**
     * <pre>
     * Seat is locked.
     * If game is forming, a bot will not sit here when the game starts.
     * If game is active, a newly-joining player can't take over a bot in this seat.
     * </pre>
     *
     * <code>LOCKED = 1;</code>
     */
    public static final int LOCKED_VALUE = 1;
    /**
     * <pre>
     * If this active game is reset, a robot will not take this seat, it will be left vacant.
     * Useful for resetting a game to play again with fewer robots, if a robot is currently sitting here.
     * Not a valid seat lock state if game is still forming.
     *&lt;P&gt;
     * This feature was added in v2.0.00; before that version, the seat lock state was
     * boolean (UNLOCKED or LOCKED).  Game resets included all robots unless their seat
     * was LOCKED at the time of reset.
     * </pre>
     *
     * <code>CLEAR_ON_RESET = 2;</code>
     */
    public static final int CLEAR_ON_RESET_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SeatLockState valueOf(int value) {
      return forNumber(value);
    }

    public static SeatLockState forNumber(int value) {
      switch (value) {
        case 0: return UNLOCKED;
        case 1: return LOCKED;
        case 2: return CLEAR_ON_RESET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SeatLockState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SeatLockState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SeatLockState>() {
            public SeatLockState findValueByNumber(int number) {
              return SeatLockState.forNumber(number);
            }
          };

    private final int value;

    private SeatLockState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SeatLockState)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
