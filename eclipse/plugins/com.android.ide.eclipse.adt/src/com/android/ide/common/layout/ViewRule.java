/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.common.layout;

import com.android.ide.common.api.IViewRule;

/**
 * An {@link IViewRule} for android.view.View and all its derived classes. This
 * is the "root" rule, that is used whenever there is not more specific rule to
 * apply.
 * <p/>
 * There is no customization here, everything that is common to all views is
 * simply implemented in BaseView.
 */
public class ViewRule extends BaseView {

}