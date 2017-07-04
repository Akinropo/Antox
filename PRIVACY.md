### Antox Privacy Policy

Antox utilizes the Tox network, a free and open source communication network. Antox is a mobile client for the Tox network, and accepts no responsibility for actions of any other device on this network.

Antox logs messages that are sent, and all logs are stored locally on the device. These logs are never sent anywhere else. All communications between users are fully encrypted using the NaCl encryption library,
https://github.com/jedisct1/libsodium

All messages sent are P2P (peer to peer), meaning they are sent directly to the end user, rather than being sent through a server. There is one exception, that the TCP design utilizes relays through other nodes on the Tox network. These messages cannot be read by the owner of these nodes due to their encryption. All of this also applies to voice/video calls and file transfers.

Camera and microphone usage is solely for calling other users, and is not recorded in any way by the application. However, this does not stop the person you are talking to from recording you.

Any connections made by the device are either to your online friends, or as a node on the Tox network to receive friend requests or access the DHT. Connecting to the network also requires connection to a bootstrap node, Antox will connect to one of these at random. A full list of the bootstrap nodes that Antox uses can be found at
https://nodes.tox.chat/.
This list is provided and maintained by The Tox Project.

The Tox network also utilizes a DHT to store IP addresses so that users are able to find each other on the network and start a connection. There is no way of matching a Tox ID with an IP address as the addresses are paired with random keys. This DHT is publicly available, meaning that whilst nobody can determine your exact IP addresses, anyone can see which IP addresses are currently connected to the Tox network.

Antox also uses ToxMe, a service that allows users to store their Tox ID in an easy to read form (example@toxme.io). ToxMe can be used by anyone, and anyone can create a clone of this service. Antox uses toxme.io by default, but you are free to use any other service that you wish. Antox does not send any user information to these services, other than a Tox ID or a ToxMe ID, for name resolution and creation.