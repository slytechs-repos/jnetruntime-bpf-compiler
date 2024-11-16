
/*
 * Sly Technologies Free License
 * 
 * Copyright 2024 Sly Technologies Inc.
 *
 * Licensed under the Sly Technologies Free License (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.slytechs.com/free-license-text
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * 
 */

import com.slytechs.jnet.compiler.CompilerFrontend;
import com.slytechs.jnet.jnetpcap.bpf.compiler.dialect.pcap.PcapFrontend;

module com.slytechs.jnet.jnetpcap.bpf.compiler {
	exports com.slytechs.jnet.jnetpcap.bpf.compiler.dialect.pcap;
	exports com.slytechs.jnet.jnetpcap.bpf.compiler.dialect.wireshark;
	exports com.slytechs.jnet.jnetpcap.bpf.compiler.dialect.ntpl;
	exports com.slytechs.jnet.jnetpcap.bpf.compiler.ir;

	requires transitive com.slytechs.jnet.jnetpcap.bpf.vm;
	requires transitive com.slytechs.jnet.compiler;
	requires transitive com.slytechs.jnet.jnetruntime;

	provides CompilerFrontend with PcapFrontend;
}