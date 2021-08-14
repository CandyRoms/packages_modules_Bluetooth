/*
 * Copyright 2021 HIMSA II K/S - www.himsa.com.
 * Represented by EHIMA - www.ehima.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.bluetooth.mcp;

/**
 * Service features definition
 */
public final class ServiceFeature {
    // LS word is used for the characteristic support bits
    public static final long PLAYER_NAME = 0x00000001;
    public static final long PLAYER_ICON_OBJ_ID = 0x00000002;
    public static final long PLAYER_ICON_URL = 0x00000004;
    public static final long TRACK_CHANGED = 0x00000008;
    public static final long TRACK_TITLE = 0x00000010;
    public static final long TRACK_DURATION = 0x00000020;
    public static final long TRACK_POSITION = 0x00000040;
    public static final long PLAYBACK_SPEED = 0x00000080;
    public static final long SEEKING_SPEED = 0x00000100;
    public static final long CURRENT_TRACK_SEGMENT_OBJ_ID = 0x00000200;
    public static final long CURRENT_TRACK_OBJ_ID = 0x00000400;
    public static final long NEXT_TRACK_OBJ_ID = 0x00000800;
    public static final long CURRENT_GROUP_OBJ_ID = 0x00001000;
    public static final long PARENT_GROUP_OBJ_ID = 0x00002000;
    public static final long PLAYING_ORDER = 0x00004000;
    public static final long PLAYING_ORDER_SUPPORTED = 0x00008000;
    public static final long MEDIA_STATE = 0x00010000;
    public static final long MEDIA_CONTROL_POINT = 0x00020000;
    public static final long MEDIA_CONTROL_POINT_OPCODES_SUPPORTED = 0x00040000;
    public static final long SEARCH_RESULT_OBJ_ID = 0x00080000;
    public static final long SEARCH_CONTROL_POINT = 0x00100000;
    public static final long CONTENT_CONTROL_ID = 0x00200000;

    // MS word is used for the optional notification support bits
    public static final long PLAYER_NAME_NOTIFY = PLAYER_NAME << 32;
    public static final long TRACK_TITLE_NOTIFY = TRACK_TITLE << 32;
    public static final long TRACK_DURATION_NOTIFY = TRACK_DURATION << 32;
    public static final long TRACK_POSITION_NOTIFY = TRACK_POSITION << 32;
    public static final long PLAYBACK_SPEED_NOTIFY = PLAYBACK_SPEED << 32;
    public static final long SEEKING_SPEED_NOTIFY = SEEKING_SPEED << 32;
    public static final long CURRENT_TRACK_OBJ_ID_NOTIFY = CURRENT_TRACK_OBJ_ID << 32;
    public static final long NEXT_TRACK_OBJ_ID_NOTIFY = NEXT_TRACK_OBJ_ID << 32;
    public static final long CURRENT_GROUP_OBJ_ID_NOTIFY = CURRENT_GROUP_OBJ_ID << 32;
    public static final long PARENT_GROUP_OBJ_ID_NOTIFY = PARENT_GROUP_OBJ_ID << 32;
    public static final long PLAYING_ORDER_NOTIFY = PLAYING_ORDER << 32;
    public static final long MEDIA_CONTROL_POINT_OPCODES_SUPPORTED_NOTIFY =
            MEDIA_CONTROL_POINT_OPCODES_SUPPORTED << 32;

    // This is set according to the Media Control Service Specification, v1.0, Section 3,
    // Table 3.1.
    public static final long ALL_MANDATORY_SERVICE_FEATURES = PLAYER_NAME | TRACK_CHANGED
            | TRACK_TITLE | TRACK_DURATION | TRACK_POSITION | MEDIA_STATE | CONTENT_CONTROL_ID;
}
